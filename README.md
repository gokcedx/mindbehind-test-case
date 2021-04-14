# MindBehind Test Case

###### @author Gökçe DOĞANAY

## Getting Started
This project is a SpringBoot app that gets a json data from an endpoint url and writes it to a text file.

### Installation
1. Clone the repo
   ```sh
   $ git clone https://github.com/gokcedx/mindbehind-test-case.git
   ```
2. Run the application
   ```sh
   $ mvn spring-boot:run
   ```
## Method
### `GET`

## Path
#### `/getComments`

## Output
#### Success - `String`
#### Fail - `JSON`

## Example
##### Request

    GET - http://localhost:8080/mindbehind/getComments/

##### Response
```
Success: true! Check [comments.txt]
```

``` json
{
    "errorCode": "404",
    "errorMessage": "Comments Not Found"
}
```