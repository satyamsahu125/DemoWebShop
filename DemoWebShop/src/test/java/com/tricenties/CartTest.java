package com.tricenties;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import object.CartPage;
import object.HomePage;
import object.ProductPage;
import object.SearchPage;
import object.WishListPage;
import utilities.BaseClass;
@Listeners(utilities.ListnerUtility.class)
public class CartTest extends BaseClass {

	@Test(groups = { "regression" }, enabled = true)
	public void clickOnAddToCart() throws InterruptedException {
		login();

		HomePage hp = new HomePage(driver);

		hp.searchProduct("Smartphone");

		SearchPage sp = new SearchPage(driver);

		sp.selectItem("Smartphone");

		sp.addToCart();

		Reporter.log(sp.getAddedresult(), true);
		Reporter.log("Tc1 Pssed" , true);
		logOut();
	}

	// Login > Search Product > Add To Cart > Open Cart > Verify Product Details
	// Match Product Page
	@Test
	public void verifyCartProductWithSelectedProduct() {

		login();

		HomePage hp = new HomePage(driver);

		hp.clickShoesLink();

		SearchPage sp = new SearchPage(driver);
		sp.selectItem("Sneaker");

		ProductPage pp = new ProductPage(driver);
		pp.selectSize(11);
		pp.selectColor(2);
		String[] poductName = pp.getSelectedNamesAndPrice();

		pp.clickAddToCart();

		pp.goToShoopingCart();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		
		CartPage cp = new CartPage(driver);
		boolean isMathching = cp.isNameAndPricePresent(poductName);

		Assert.assertTrue(isMathching);
		Reporter.log("Tc2 passed");
		logOut();

	}

	@Test
	public void checkAddedProduct() {

		login();

		HomePage hp = new HomePage(driver);

		hp.clickShoesLink();

		SearchPage sp = new SearchPage(driver);
		sp.selectItem("Sneaker");

		ProductPage pp = new ProductPage(driver);
		pp.selectSize(11);
		pp.selectColor(2);
		String[] productName = pp.getSelectedNamesAndPrice();

		pp.clickAddToWishList();


		pp.goToWishList();

		WishListPage wp = new WishListPage(driver);

		boolean b = wp.isNameAndPricePresent(productName);
		Reporter.log("name and prices match with selected product: " + b, true);
		Reporter.log("Tc3 Passed");
		Assert.assertTrue(b);

		logOut();

	}
	@Test
	public void verifyProductAfterLogout() {

		login();

		HomePage hp = new HomePage(driver);

		hp.clickShoesLink();

		SearchPage sp = new SearchPage(driver);
		sp.selectItem("Sneaker");

		ProductPage pp = new ProductPage(driver);
		pp.selectSize(11);
		pp.selectColor(2);
		String[] productName = pp.getSelectedNamesAndPrice();

		pp.clickAddToWishList();
		
		pp.clickOnlogOutLink();
		
		
		login();
		hp.goToWishList();
		
		WishListPage wp = new WishListPage(driver);

		boolean b = wp.isNameAndPricePresent(productName);
		Reporter.log("name and prices match with selected product: " + b, true);
		
		Assert.assertTrue(b);
		Reporter.log("Tc4 passed" ,true);
		logOut();

	}

}
