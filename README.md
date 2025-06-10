✅ Input
Send a GET request to the following endpoint in the browser or in the postman:

GET /prime/checkPrime/{num}

Replace {num} with any positive integer.
Example:

GET /prime/checkPrime/5
📤 Output
The response will be a simple message indicating whether the number is prime or not:

"5 is a prime number."
⚠️ Error Handling
This application includes global exception handling using @ControllerAdvice.
If the input is invalid (e.g., a string or special character instead of a number), you’ll receive a meaningful error response:

{
  "message": "Invalid input: 'abc'. Please provide a valid number."
}

