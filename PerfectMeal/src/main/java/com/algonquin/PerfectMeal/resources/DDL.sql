DROP DATABASE IF EXISTS PerfectMeal;
CREATE DATABASE 	PerfectMeal 
	DEFAULT CHARACTER SET 		utf8 
	COLLATE 					utf8_unicode_ci;
USE PerfectMeal;

CREATE TABLE USER (
					UUID 		CHAR(40) NOT NULL PRIMARY KEY, 
					FirstName 	CHAR(100),
					LastName 	CHAR(100), 
                    Username 	VARCHAR(100),
                    Password 	VARCHAR(100),
                    Email		VARCHAR(100),
                    isVerified 	BOOLEAN DEFAULT FALSE
				    );

CREATE TABLE MEAL (
					MealID		INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                    MealName	CHAR(255),
                    Description	VARCHAR(255),
                    CookTime	VARCHAR(40),
                    MealLink	VARCHAR(255)
				    );

CREATE TABLE INGREDIENT (
					IngredientID		INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                    IngredientName		CHAR(255)
                    );

CREATE TABLE MEAL_INGREDIENT (
					Meal_IngredientID	INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                    MealID				INT,
                    CONSTRAINT MEAL_FK FOREIGN KEY ( MealID )
										REFERENCES MEAL ( MealID ),
                    IngredientID		INT,
                    CONSTRAINT INGREDIENT_FK FOREIGN KEY ( IngredientID )
										REFERENCES INGREDIENT ( IngredientID )
					);