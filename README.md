openmrs-payment-hub
==========================

Description
-----------
This module is a payment hub for OpenMRS, designed to integrate external payment systems such as Stripe and PayPal. It provides a seamless way to manage payments within the OpenMRS ecosystem.

Setup Instructions
--------------------
To set up the OpenMRS Payment Hub repository, follow these steps:

1. **Prerequisites**: Ensure you have the following installed:
   - Java 1.6 or higher
   - Maven 2.x or higher

2. **Clone the Repository**: Use the following command to clone the repository:
   ```bash
   git clone https://github.com/yourusername/openmrs-payment-hub.git
   cd openmrs-payment-hub
   ```

3. **Build the Module**: Run the following command to compile and package the module:
   ```bash
   mvn package
   ```
   The resulting `.omod` file will be located in the `omod/target` folder.

4. **Deploy the Module**: You can deploy the module using one of the following methods:
   - **Via OpenMRS Administration**: Navigate to the OpenMRS Administration > Manage Modules screen to upload and install the `.omod` file.
   - **Manual Installation**: If uploads are not allowed from the web (this can be changed via a runtime property), drop the `.omod` file into the `~/.OpenMRS/modules` folder. After placing the file there, restart OpenMRS/tomcat to load and start the module.

5. **Development**: If you want to deploy changes to your web resources (like JSP or JS files) without reinstalling the module, add the snippet provided in the [Creating Modules](https://wiki.openmrs.org/x/cAEr) page to your `omod/pom.xml` and use the following command:
   ```bash
   mvn package -P deploy-web -D deploy.path="../../openmrs-1.8.x/webapp/src/main/webapp"
   ```

This will allow you to make changes and see them reflected immediately without the need for a full module reinstall.
