# TeachMeSkills_C32_HW_Lesson_13
### The implementation contains:
Create a class with a static method.
This method takes three parameters as input:

Login
Password
ConfirmPassword.

All fields have the String data type.

The length of login must be less than 20 characters and must not contain spaces.
If login does not meet these requirements, a WrongLoginException should be thrown.

The length of password must also be less than 20 characters, must not contain spaces, and must contain at least one digit. Additionally, password and confirmPassword must match.
If password does not meet these requirements, a WrongPasswordException should be thrown.

The exception classes WrongPasswordException and WrongLoginException are custom exception classes with two constructors: one default constructor and another that accepts an exception message and passes it to the Exception class constructor.

The method should return true if the values are valid, or false otherwise.

Organize the classes into packages:

The class for validation should be in its own package.
The exception classes should be in a separate package.
Create a Runner class to test this validation class.

Try to solve the problem in two ways:

Using built-in String methods like contains.

By splitting the string into a character array (toCharArray()) and iterating through the array for validation.
