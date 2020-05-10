$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/AddBook.feature");
formatter.feature({
  "name": "AddBookInBasket",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "AddProduct",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "name": "user click Login button",
  "keyword": "When "
});
formatter.step({
  "name": "user enter email \"\u003cemail\u003e\" and enter  password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user click GirisYap button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "seleniumautomation987123@gmail.com",
        "selenium123."
      ]
    }
  ]
});
formatter.scenario({
  "name": "AddProduct",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.AddBookTestSteps.GoToHomePage()"
});
