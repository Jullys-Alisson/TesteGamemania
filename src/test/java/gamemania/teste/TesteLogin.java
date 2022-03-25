package gamemania.teste;

import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLogin {

	private WebDriver driver;

	@Before
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://localhost:4200/login");

	}

	@Test
		public void testarLogin() {
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			WebElement inputEmail = driver.findElement(By.id("email"));
			WebElement inputSenha = driver.findElement(By.id("senha"));
			WebElement botaoLogin = driver.findElement(By.className("button"));
			
			inputEmail.sendKeys(" jullys@mail");
			inputSenha.sendKeys("senha123456");
			botaoLogin.click();  
			
			/*String[] listaSenhas = {"primeira","segunda","terceira","senha123456"};
			for (int tentativa = 0; tentativa < listaSenhas.length; tentativa++) {
			
				try {
					inputEmail.clear();
					inputSenha.clear();
					
					inputEmail.sendKeys(" jullys@mail.com");
					inputSenha.sendKeys(listaSenhas[tentativa]);
					botaoLogin.click();
					
					Thread.sleep(2000);
					} catch(InterruptedException e) {
						e.printStackTrace();
					
				}
				
			
			
			}*/

			//driver.findElement(By.id("oqEstabuscando")).sendKeys("Técnico");

			//driver.findElement(By.className("btnBuscaJavaScript")).click();

		}

}
