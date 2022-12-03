# TestNG Tutorial with MAVEN

## Parameterising global variables

## What we are trying to achieve

- a way to set global variables in an external location so that they are easy to update
- our tests will then retrieve these global variables so they inherit any changes to the values
- this will prevent the need to update individual test cases, meaning easy maintenance

config.properties => FirstTest
``` python
	driver.get(prop.getProperty("url"));
```

## Steps Required
- create a .properties file in our project
- create key:value pairs in the .properties file (e.g url=www.site.com)
- amend our Java class to make use of "Properties" and "FileInputStream" (so that we can pass the data from the .properties file to our classes)
- then, amend our methods so we can then receive and use the "value" from the .properties file
- we can then change the url in the .properties file to observe the method inherit the change
