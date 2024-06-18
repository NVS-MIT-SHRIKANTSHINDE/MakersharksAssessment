# MakersharksAssessment
# User API
application.properties
Update application.properties file if you want to change server port configuration:(currently running on 8080)
# application.properties
server.port=8080

## Endpoints

### Register User

- URL: `/api/user/register`
- Method: `POST`
- Request Body:
  ```json
  {
    "username": "user1",
    "email": "user1@example.com",
    "password": "password123"
  }

### Fetch User
- Method: `GET`
- URL: `/api/user/fetch?username=user1`

  
