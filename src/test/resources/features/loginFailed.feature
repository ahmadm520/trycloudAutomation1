Feature: As a user, I should not be able to login to TryCloud app

  @invalid
Scenario Outline: verify user login fail with invalid credentials "<username>"
Given user on the login page
When user enter invalid "<username>" and "<password>"
And  user click login button
Then "<message>" message should be displayed

Examples:
| username | password    | message                     |
| User9    | Wrong       | Wrong username or password. |
| Wrong    | Userpass123 | Wrong username or password. |
| Wrong    | Wrong       | Wrong username or password. |
