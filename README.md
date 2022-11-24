# TestNG Tutorial with MAVEN

## Executing Methods By Common Name
- if we wanted to run just the "Tablet" related methods, then we can do that by simply amending our testng.xml
- we can use the <include> tags to run methods that have a particular value in the name
```python
# just the "Tablet" related methods
   <test name="TestOne">
    <classes>
     <class name="demo.testng.FirstTest">
       <methods>
         <include name="Tablet.*" />
       </methods>
     </class>
   </classes>
  </test>
```
- when we run this code, only the methods that have "Tablet" in the name will execute
- the * acts as a wild car character, meaning anything following the Tablet wording will run
- this is useful because it gives us flexibility in being selective in the tests we choose to run
```python
# just the "Tablet" related methods Tablet_login() & Tablet_addItem()
   <include name="Tablet.*" />
```

