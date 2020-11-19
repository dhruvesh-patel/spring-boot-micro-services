This repo is for Spring boot microservices - the microservices are loosely coupled, autonomous, independantly deployable services that are developed around business capabilities. In this repo, forex Conversion or remittance platform use case is used as reference. There are 2 microservices and one eureka discovery server from spring cloud. 

- Currency Exchange Service - Provides latest exchange rate for a pair of from and to currency. Let say GBP to INR exchange rate is 98.

- Currency Conversion Service - Provides Converted exchange value for a pair of currency based on amount quantity. Let say, for 100 GBP to INR conversion value will be 9800 (98 * 100). Utilizes Currency Exchange service using Feign Client. 

- Eureka Naming Server - to register each microservice, so service discovery can be done easily

Following are ports for each service. Start them in IDE in below order - starting with Eureka Server first.
```
1) Eureka Server - http://localhost:8761/
2) Currency Exchange Service - http://localhost:8000/
3) Currency Conversion Service - http://localhost:8161/
```
Following are exposed APIs (GET) for each service. 

1) Currency Exchange Service - 

```
API Request (GET) - http://localhost:8000/currency-exchange/from/GBP/to/INR
API Response - 

{
    "id": 10004,
    "from": "GBP",
    "to": "INR",
    "conversionMultiple": 98
}
```

2) Currency Conversion Service - 
```
API Request (GET) - http://localhost:8161/currency-converter-feign/from/GBP/to/INR/quantity/100
API Response - 
{
    "id": 10004,
    "from": "GBP",
    "to": "INR",
    "conversionMultiple": 98,
    "quantity": 100,
    "totalCalculatedAmount": 9800
}
```
