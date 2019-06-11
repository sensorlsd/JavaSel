$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/src/Feature/stackLogin.feature");
formatter.feature({
  "name": "Open and Login into account",
  "description": "  Existing user should be able to login to account using correct credentials",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login intro account with correct credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to stackoverflow website",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_navigate_to_stackoverflow_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters a valid username",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_enters_a_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters a valid password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_enters_a_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be takes to the successful login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_should_be_takes_to_the_successful_login_page()"
});
formatter.result({
  "status": "passed"
});
});