Feature: Login Attempts

  Scenario Outline: Succesful Login
     When I enter site
     Then I login as <username> and password: <password>
     Then I see that I'm logged in
     Then I logout
     
  Examples:
      | username                  | password       | 
      | 'standard_user'           | 'secret_sauce' | 
      |	'locked_out_user'	  | 'secret_sauce' |
      |	'problem_user'		  | 'secret_sauce' |
      |	'performance_glitch_user' | 'secret_sauce' |
      | 'test'                    | 'test'         |
