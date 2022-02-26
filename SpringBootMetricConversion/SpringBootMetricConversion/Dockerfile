FROM java:8-jdk
ENV APP_HOME=/usr/app
WORKDIR $APP_HOME
copy build/lib/*.jar SpringBootMetricConversion.jar
CMD ["java","-jar",SpringBootMetricConversion.jar]