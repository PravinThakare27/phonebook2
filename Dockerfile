From openjdk:8
COPY /target/PhoneBook.jar PhoneBook.jar
ENTRYPOINT ["java","-jar","PhoneBook.jar"]
EXPOSE 8080