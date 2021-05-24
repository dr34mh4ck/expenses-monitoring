# Expenses-monitoring

Simple expenses springboot application, basic CRUD operations for expense object.

# Running
  - execute
    ```docker-compose up -d``` or
  - use k8s files to deploy on kubernetes
 
# Monitoring

Uses Springboot actuator to feed prometheus server with project metrcis and exposes grafana dashboard that takes prometheus metrics to present the data.
