# Getting started with GraphQL in spring boot
##About
GraphQL is a query language for APIs and a runtime for fulfilling those queries with your existing data. GraphQL provides a complete and understandable description of the data in your API, gives clients the power to ask for exactly what they need and nothing more, makes it easier to evolve APIs over time, and enables powerful developer tools.

####key features:

=> Ask for what you need, get exactly that

=> Get many resources in a single request

=> Describe what’s possible with a type system

=> Move faster with powerful developer tools

=> Evolve your API without versions

=> Bring your own data and code

Facebook's mobile apps have been powered by GraphQL since 2012. A GraphQL spec was open sourced in 2015 and is now available in many environments and used by teams of all sizes.

Here if you want to explore further, you can implement a Basic Graphql API where you can query 
and create an Object through API.

key areas to explore during implementations: 
1) nested object implementations
2) type null check validations for input through (!)
3) passing enum field inside graphql api's



#Summary of Designing a basic API application

## Dependencies
spring web,
graphql-java,
h2database,
r2dbc

##Steps taken
1. we will open https://start.spring.io/
2. add the dependencies
3. click generate at the bottom download it and then extract the zip
4. Now open intelliJ and goto file-> open  and select the inner folder in which we have pom.xml
5. Create the graphql schema types query and mutations enums etc. in resources folder
6. Add the sql table schema in resources folder
7. Now Create the model controller repository and service packages and bind them in the main GraphQL application
8. Run the application and open Altair graphQL application on Chrome extension and the url is:  
   http://localhost:8080/graphql
    you will be able to see available query and mutations like given below
    ![Alt text](images/docs.JPG?raw=true "Title")
    here's sample query request to graphQL api
    ![Alt text](images/query.JPG?raw=true "Title")
   here's sample mutation request to graphQL api
    ![Alt text](images/mutation.JPG?raw=true "Title")
    
I hope this basic application help you get started with GraphQL in spring framework setup. Will come back with more 
such small implementations.