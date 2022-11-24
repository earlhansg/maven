# TestNG Tutorial with MAVEN

## What Are Groups

- they are powerful way to group tests together so that we can run a specific group of test at a time
- for example, say we a handful of test we want to run during a "Smoke" test and then wanted to test in more detail during a "Regression" test
- we can assign a "Group" to the tests that make up the "Smoke" tests and do the same for those that form the "Regression" tests
- this way, we can ammend our testng.xml file to only run the group of tests that meet our requirement

### testng.xml
```python
# just run "regression" labeled method
   <groups>
		<run>
			<include name="regression" />
		</run>
	 </groups>
```

### how to label wether it is "smoke" or "regression"
```python
# how the code look like
  @Test (groups= {"smoke", "regression"})
	public void method1() {
		System.out.println("Hello World from method 1");
	}

	@Test (groups= {"smoke"})
	public void method2() {
		System.out.println("Hello World from method 2");
	}
```
