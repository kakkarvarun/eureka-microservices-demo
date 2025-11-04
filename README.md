# eureka-microservices-demo

# Microservices with Eureka (Classwork)

## Objective
Learn how multiple Spring Boot microservices discover and communicate via Spring Cloud Netflix Eureka and observe registrations on the Eureka dashboard.

## Services
- **Eureka Server** — Service registry (Port **8761**)
- **Exchange Service** — Provides exchange rate info (Port **8000**)
- **Currency Service** — Calls Exchange to convert an amount (Port **8100**)

## Prerequisites
- Java 17+
- Maven 3.8+
- (Using GitHub Codespaces with Java 17 devcontainer)

## How to Run (Codespaces)
1. Start **Eureka**:
   ```bash
   cd eureka-service
   mvn -q -DskipTests spring-boot:run
Open the forwarded 8761 port → Eureka dashboard.
2. Start Exchange:

cd exchange-service
mvn -q -DskipTests spring-boot:run

3. Start Currency:
   cd currency-service
   mvn -q -DskipTests spring-boot:run

4. Test Currency API in the 8100 browser tab:

   /currency/convert/from/USD/to/INR/amount/10
You should see JSON output with convertedAmount.

Endpoints

Eureka: http://localhost:8761/ (dashboard)

Convert: http://localhost:8100/currency/convert/from/{from}/to/{to}/amount/{amount}

Notes

currency-service uses WebClient with @LoadBalanced and the logical name http://exchange-service so it resolves via Eureka rather than a fixed host:port.
