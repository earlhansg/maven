# TestNG Tutorial with MAVEN

## Current Problem

- we have to write code to initialize the driver in every Class
- if we wanted to switch browser (e.g use Firefox on Edge) then we need to update various lines of code
- what happens if we have hundred of Classes to update?
- it is feasible to update each individual class to use the browser of our choosing? No!

## How to improve our design 
- we could adopt a similar global variable solution by storing the browser type (e.g "chrome", "firefox" or "edge") in the .properties file
- we can then us logic to determine which browser to initialise based on the browser value that is sent to our test Class
- we can do this using IF ELSE statements

config.properties "browser=chrome" => LoginTest
