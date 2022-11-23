# TestNG

## Test Execution Flexibility

### Total Control
- TestNG provides extreme flexibility in controlling what Packages, Classes and Test Methods should run
- Much of this control is handled by the testng.xml file
- We can use XML tags to control what should execute when we trigger a test
- For example, we can set out testng.xml so that it only trigger particular Packages or Classes or Test Methods (all down to our choosing)


```python
# run all test with specific classname in order
  <test name="TestOne">
    <classes>
      <class name="demo.testng.FirstTest"/>
      <class name="demo.testng.SecondTest"/>
      <class name="demo.testng.ThirdTest"/>
      <class name="demo.testng.FourthTest"/>
      <class name="demo.testng.FifthTest"/>
    </classes>
  </test>
```

```python
# run all test in a directory
  <test name="TestOne">
    <packages>
      <package name="$directoryname"><package>
    </packages>
  </test>
```

