<%@ page import="java.util.UUID,java.time.ZonedDateTime" %>
<!DOCTYPE html>
<html>
  <body>
    <h1>Hello from Elastic Beanstalk!</h1>
    <p>Request ID: <%= UUID.randomUUID().toString() %></p>
    <p>Timestamp: <%= ZonedDateTime.now().toString() %></p>
  </body>
</html>
