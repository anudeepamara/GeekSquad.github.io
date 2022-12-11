## This Document Describes the Functional and Non-Functional Requirements for the project.

# Software Requirements

# Functional Requirements

### Login/Register

   |        ID       | Requirement |
   | :-------------: | :----------: |
   | FR1 | Login page where user needs to enter the credentials of his/her Shall account. and then it shall redirect to home page. |
   | FR2 | If the user is new to account/application. When the user tries to login, there shall be a option called sign up page.|
   | FR3 | If the user clicks on sign up page. Registration page should get opened.|
   | FR4 | In registration page, there will be multiple fields to enter the details the user. For few fields there shall be validation for email and password.|
   | FR5 | The application shall validate the user data from the database weather its correct or not and it will process the request.|
   | FR6 | After successful login, application shall redirect to homepage. |

### HomePage 

   |        ID       | Requirement |
   | :-------------: | :----------: |
   | FR7 | user can be able to access the homepage fully and there shall be multiple options available in the homepage. and can be able to view the features in the application.|
   | FR8 | In the home page there shall be a navigation bar and user can be able to access that navigation bar.|
   | FR9 | The options showing in the bar able to click them. there will be an option called order now. user can     be able to click that option. |
   | FR10 | Whenever user clicks the order now option it should redirect to the restaurant’s page and able to show the data of restaurants present in that location.|
   | FR11 | The User shall be able to see all the details presented in the application and able to click them or view them.|


### Restaurant’s & Food 

   |        ID       | Requirement |
   | :-------------: | :----------: |
   | FR12 | In the restaurant page user shall be able to see all the restaurant’s presented in the location.|
   | FR13 | In the restaurant page user shall be able to select the restaurant and able to see all the food items presented in the restaurant.|
   | FR14 | The button needs to be active and whenever user clicked the button it should show all the food items.|
   | FR15 | The user shall be able to feel the food items whenever shall tries to move the cursor on them which was displayed in the food items page.| 
   | FR16 | The user shall be able to access the food items and he can be able to add that item to his cart and then it should store.|
   | FR17 | The Data needs to get update in the database as of user preferences.|



### Cart 
   
   |        ID       | Requirement |
   | :-------------: | :----------: |
   | FR18 | The all the cart items which shall be added in his account user can be able to view those items.|
   | FR19 | The users shall be able to edit the quantity of those and he can be able to delete the items whatever he needs.|
   | FR20 | The moment user updated or deleted few items all the data needs to be updated.|
   | FR21 | The changes also need to show in the webpage as per updated database.in the user account.|
   | FR22 | The cart page user can be able to see the option called place an order where user shall be able to place his order|


### SettingsPage      
   
   |        ID       | Requirement |
   | :-------------: | :----------: |
   | FR23 | In the application there shall be a footer section where the user can be able to see the option called settings.|
   | FR24 | The Moment user that he can be able to see what all available options in that page.|
   | FR25 | In the settings page user can be able to see the option called update the password.|
   | FR26 | It should redirect to the page where user shall be able to edit the password of his account.|
   | FR27 | The same data needs to get updated in the database.|
   | FR28 | The user can shall be able to edit the location preference in the application.|


### OrderItemsPage
   
   |        ID       | Requirement |
   | :-------------: | :----------: |
   | FR29 | The application shall be having an option called orders. he can be able to click and perform the operation.|
   | FR30 | That orders page will display all the records of his orders from the database.|
   | FR31 | User can shall be to see the orders in the data wise.|


# Non-Functional Requirements

1. Reliablity
   1. The food order application has been easily interacting with the users and accessible to them. And it should meet all the 
      regulatory requirements to the application.
   2. The application should be reliable, and it should not have any vulnerability and it should check the other competitors 
      like swiggy and zomato also in the same business. They need to understand what the mistakes are doing by them and rectify in the competition with upgrading technologies.

2. Scalability 
   1. The applications need to be tested all the possible scenarios and negative ways to keep the application bug free 
      and the  performance of the application and the speed needs to be accurateto access the application and work with that.
   2. If the user wants to change the password of the Application, the user will get a email verification to change the password.    

3. Perfomance
   1. In the food order application, performance is extremely important and can be compared to how quickly the system reacts to
      user activity or how long a user must wait for an operation to complete.   
   2. If a problem arises from the buyer's side or otherwise from the seller side, the seller shall act quickly and accurately 
      fullfill the order by the estimated delivery date and time.  

4. Manageability 
   1. The system's upkeep and manageability are measured by how long it takes to resolve problems thatarise in the middle of 
      operations and by how simple it is for the administrator to control the system.

5. Security
   1. It must allow users to verify their accounts using their phone number.

6. Portablity
   1. The application is portable.where it shall be responsive from one device to others as well.

7. Usablity
   1. The application shall open without any flaw or malfunction for the homepage and other features.
   2. The user shall easily navigate one page to other page with ease and can easily understand the purpose of features,anduseer 
      friendly where it can be defined as Usability.

8. Interoperability 
   1. The application is interoperable is the ease with which a system can interchange data and share information with other 
      computers and external devices.      



    

## Change Management Plan

This section was the quick setup Guide for the users how to use our application and what are the steps involved in this application to understand the usage in easy manner.

## How To Train the People To Use The Application:

- This Application was a completed Web-Based Application.
- Users can easily redirect to the application with the URL.
- The users can visible the features that we are provided in the application a button for SIGNUP.
- That Signup button will take the users to the Registration Page where they can setup their account in the application.
- Once They setup completed, they can see one option called Login in the page, if they click that option it will redirect them to the Login page. so that they can be able to login to the application.
- After Successfully Logged In They can see various Option in the webpage like Order Now, Cart, Settings. these three are hyperlinks and whenever user clicks to any of those links it will take to the respected page. each page has its own features.
- If The user Clicks the Order Now page it show all the Restaurant’s which were Located in the particular Location and the user Needs To select one of the restaurant and they user can able to see all The Food Items Presented in the Restaurant.
- The User can See the Option Called ADD TO CART This button will help user to add the interested Food item in the cart form there he can place the order.
- After The user added The Item, He can an Option Called ORDER NOW whenever the user clicks that button it will redirect to another page and it will show all the items that user has added into his cart. Here user can update the quantity of those items or else he can remove some of the items from his cart and check the Total Price. in the Bottom Hew can see Order Button.
- If The user clicks the order button it will redirect him to the payment page and user needs to enter his credit/debit card details and process the payment.
- In The Main Page User Can see the option called Order History where the user can see all his/her previous orders in the application.
_ There is one more option added in this application was SETTINGS page whenever user wants to update his personal information like Password , Location preferences he can choose that option and update the data.

## How To ensure that it integrates within their ecosystem / software:

- This Application was normal Spring Boot application we made this whole application in the Form of a JAR file.
- Customers can Install this jar file in their system this will support all the platforms like windows, Linux and MacOS.
- This was consisting of the Maven Build methods. if you run the build, it will show the tests results that the installation of the product.

Run These Commands in order to install all the dependencies for the application.

```sh
mvn clean install 
mvn install
```
After The successful installation you can see the report that Build has been passed or Failed.

- After Installed the dependencies. this consists of various Junit Test files that has mocked up the data in all the methods to test the functionality of the application.
- The report suggests the status of the application weather successfully installed or not.

This application is currently extended with the following plugins which was coded in the POM.XML file in the application.

| Plugin | DESCRIPTION |
| ------ | ------ |
| org.apache.tomcat.embed | This plugin was used to run the server in the web application |
| mysql-connector-java | This plugin was used to setup the database integration |
| mysql-connector-java | This plugin was used to setup the database integration |
| org.junit.vintage    | This was the plugin for the Jnuint to run the test cases in the system |
| org.springframework.boot | This plugin was used to create the spring nature in the application |

- We can check for the user feedback also to ensure that the application has been installed smoothly and working in all possible ways.
- Based on the Booking’s made by user we can ensure that all the functional requirements have been working.

## To ensure that it has resolved the issues of food ordering:

## Traceability links
 
 This section was about to explain the indetails of the class diagrams and the use case diagrams,Activity diagrams which were involved in the application.
 
## use case Diagram 
 
| Artifact ID | Artifact Name | Requirement ID |
| :-------------: | :----------: | :----------: |
|    Id1     | Food Items    |     FR14   |
|    Id2     | View Items    |     FR18     |
|    Id3     | Add To Cart   |     FR16    |

## Activity Diagram

| Artifact ID | Artifact Name | Requirement ID |
| :-------------: | :----------: | :----------: |
|    Id4     | Add To Cart    |     FR16    |
|    Id5     | update The quantity    |     FR19     |
|    Id6     | Remove the items   |     FR20     |

## Class Diagram

| Artifact Name   | Requirement ID |
| :----------:    | :----------: |
| Class User      |     FR1-FR6    |
| Class Location  |     TBD     |
| Class Restuarent     |     FR12,FR13     |
| Class Food      |     FR14,FR15,FR16     |
| Class Admin      |     FRtbd5     |
| Class Cart      |     FR18,FR19,FR20    |
| Class Cart Items      |     FR21,FR22   |
| Class Orders      |     FR29,FR30    |
| Class Order Items      |     FR31     |

# Software Artifacts

This section was about to Guide all the artifacts which were developed while creating the application. And we will assign the function and non-functional requirements to align with the artifacts.below was the links to referer the each artifacts for the application.

* [Use Case Diagrams + Activity Diagrams](https://github.com/anudeepamara/GeekSquad.github.io/blob/master/docs/Content1.pdf)
* [Class Diagram + Object Model](https://github.com/anudeepamara/GeekSquad.github.io/blob/master/docs/Content2.pdf)
* [Sequence Diagram + State Machine](https://github.com/anudeepamara/GeekSquad.github.io/blob/master/docs/Content3.pdf)
* [Siganature + Class Diagram](https://github.com/anudeepamara/GeekSquad.github.io/blob/master/docs/Content5.pdf)
* [Database Tables](https://github.com/anudeepamara/GeekSquad.github.io/blob/master/docs/Content7.pdf)
* [Mockup Screens](https://github.com/anudeepamara/GeekSquad.github.io/blob/master/docs/Content8.pdf)
* [Class Diagrams with pre conditions and post conditions](https://github.com/anudeepamara/GeekSquad.github.io/blob/master/docs/Content6.pdf)












   
   



