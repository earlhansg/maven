# TestNG

## Test Execution Flexibility

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

