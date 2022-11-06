$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/study.feature");
formatter.feature({
  "name": "Case Study Tests",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "homepage is open",
  "keyword": "Given "
});
formatter.match({
  "location": "casestudy.step_def.MyStepdefs.homepageIsOpen()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add product to basket without login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@loginsiz"
    }
  ]
});
formatter.step({
  "name": "I search with \"bilgisayar\"",
  "keyword": "And "
});
formatter.match({
  "location": "casestudy.step_def.MyStepdefs.iSearchWith(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to any product detail page",
  "keyword": "Then "
});
formatter.match({
  "location": "casestudy.step_def.MyStepdefs.iGoToAnyProductDetailPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add basket product with two different seller",
  "keyword": "And "
});
formatter.match({
  "location": "casestudy.step_def.MyStepdefs.iAddBasketProductWithTwoDifferentSeller()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify product on basket page",
  "keyword": "Then "
});
formatter.match({
  "location": "casestudy.step_def.MyStepdefs.iVerifyProductOnBasketPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});