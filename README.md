   ![Recipe-Management](https://github.com/Sowndarya9920/Recipe_Management_System/assets/112794922/0bf49c3b-4d8f-4ee7-850d-377bd20f5af2)
   
   ##### 🔸This is simple recipe management system built using Spring Boot framework. The idea was to build  a simple recipe management to perform basic CRUD operations                  with some validations and also auhentication.
## :one: Frameworks and Languages Used -
    1. SpringBoot
    2. JAVA
    3. Postman
    4. SQL
    
## :two: Dependency Used
    1. Spring Web
    2. Spring Boot Dev Tools
    3. Lombok
    4. Spring Data JPA
    5. MySQL Driver
    6. Validation
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
## :three: Dataflow (Functions Used In)
### :white_flower: 1. Model - This used to show the mirror of our database which involves real world entities.
#### :o: AuthenticationToken.java
#### :o: User.java
#### :o: PremiumRole.java
#### :o: Recipe.java
#### :o: Ingredients.java
#### :o: ProcessStatus.java

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

### :white_flower: 2. Service - This Layer is used to perform business functionalities.
#### :o: HeadAdminService.java
#### :o: IngredientsService.java
#### :o: PremiumRoleService.java
#### :o: RecipeService.java
#### :o: TokenService.java
#### :o: UserService.java


----------------------------------------------------------------------------------------------------------------------------------------------------

### :white_flower: 3. Controller - This Controller is used to create RestApi's and perform basic CRUD operations.
#### :o: IngredientsController.java
#### :o: PremiumRoleController.java
#### :o: RecipeController.java
#### :o: UserController.java

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
### :white_flower: 4. Repository : data access object (DAO) is an object that provides an abstract interface to some type of database or other persistence mechanisms.
#### :o: IIngredientsDao.java
#### :o: IPremiumRoleDao.java
#### :o: IRecipeDao.java
#### :o: ITokenDao.java
#### :o: IUserDao.java

-------------------------------------------------------------------------------------------------------------------------------------------------------
### :white_flower: 5. Dto : Data transfer object
#### :o: SignInInput.java
#### :o: SignInOutput.java
#### :o: SignUpInput.java
#### :o: SignUpOutput.java
-------------------------------------------------------------------------------------------------------------------------------------------------------
## :five: Test Rest Api's
#### :white_check_mark: User Controller
```java
http://localhost:8080/signUp
```

```java
http://localhost:8080/signIn
```

#### :white_check_mark: PremiumRole Controller
```java
http://localhost:8080/roles
```

#### :white_check_mark: Recipe Controller
```java
http://localhost:8080/recipe
```

#### :white_check_mark: Ingredients Controller
```java
http://localhost:8080/ingredients
```

## :six: Documentation in Swagger
```java
 http://localhost:8080/swagger-ui/index.html#/
```
![image](https://github.com/Sowndarya9920/Recipe_Management_System/assets/112794922/29532ed4-f71d-44d2-b4bd-b38f75c68641)


## :seven: View in mySql Database

![image](https://github.com/Sowndarya9920/Recipe_Management_System/assets/112794922/3e6f6f82-002c-4846-8146-672facd32099)



#  Summary
- :small_orange_diamond:  This is a sample recipe management system that allows two users :
- :one: Normal
- :two: Admin
- :small_orange_diamond: Admin users have all access to perform all the CRUD operations whereas the normal users can only edit and view the receipes.
-  :small_orange_diamond: The API is built using mySQL database to store the recipes,ingredients and all its fields . IP Address of the deployment link must be static to ensure its availability. Additionally , the Api's uses annotation based validations to ensure that all the user inputs are valid before being processed.
-  :small_orange_diamond: Therefore , this project provides a scalable and secure API that allows to manage all the datas.

