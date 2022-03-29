Feature: Succesful checkout

Scenario: Add Item to cart and checkout
	When I enter site
	Then I login as "standard_user" and password: "secret_sauce"
	Then I add item to cart
	Then I go to cart
	And I checkout
	Then I logout
	