# Customer Validation System

A sample JSF 2.0 Program that helps understand the customer validations, conversion and the Life Cycle Scope and Page Navigation.

## Create Project

Use the below Maven command to generate the project:

```bash
mvn archetype:generate  -DgroupId=com.test.jsf.react  -DartifactId=sample-react-jsf  -DarchetypeArtifactId=maven-archetype-webapp	
```
However since we have the code already, just clone the project and have a quick review.

## Steps to Run the Project in Tomcat

1. Build the Project

```bash
mvn clean package
```
2. Move the generated **sample.war** file to the Tomcat Application's webapp directory.

```bash
cp target/sample.war <TOMCAT_HOME>/webapp/
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[Apache 2.0](https://www.apache.org/licenses/LICENSE-2.0)