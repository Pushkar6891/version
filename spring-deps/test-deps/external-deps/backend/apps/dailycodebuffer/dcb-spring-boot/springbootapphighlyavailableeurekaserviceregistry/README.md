#### Link

https://www.youtube.com/watch?v=Y3JxNzBSOp0&t=362s

#### Start service-registry for 3 profiles:

cd /Users/pushkarchauhan91/Documents/workspace_sts/workspace_sts_company/springbootmultimoduleparent/java/version/backend/apps/springbootapphighlyavailableeurekaserviceregistry/target

java -jar springbootapphighlyavailableeurekaserviceregistry-0.0.1.jar --spring.profiles.active=eureka-1
java -jar springbootapphighlyavailableeurekaserviceregistry-0.0.1.jar --spring.profiles.active=eureka-2
java -jar springbootapphighlyavailableeurekaserviceregistry-0.0.1.jar --spring.profiles.active=eureka-3

#### Start eureka-client:
cd /Users/pushkarchauhan91/Documents/workspace_sts/workspace_sts_company/springbootmultimoduleparent/java/version/backend/apps/springbootapphighlyavailableeurekaclient/target

java -jar springbootapphighlyavailableeurekaclient-0.0.1.jar

#### Test Links:

http://localhost:9001
http://localhost:9002
http://localhost:9003