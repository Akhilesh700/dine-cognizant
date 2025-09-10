# Dine Cognizant - Online Food Delivery System

![Food Delivery Banner](https://placehold.co/1200x400/FF6347/FFFFFF?text=Dine+Cognizant)

## 1. Introduction

**Dine Cognizant** is a modern, full-featured online food delivery platform designed to connect customers with their favorite local restaurants. This system provides a seamless experience for browsing menus, placing orders, managing payments, and tracking deliveries in real-time.

This project is built on a robust, scalable architecture, making it suitable for both development environments and large-scale production deployments. The design supports both **Java (Spring Boot)** and **.NET (ASP.NET Core)** frameworks for the backend.

---

## 2. Core Modules

The application is broken down into five core modules, each handling a specific domain of functionality:

| Module                 | Description                                    | Key Features                                                                   |
| :--------------------- | :--------------------------------------------- | :----------------------------------------------------------------------------- |
| **Customer Management** | Handles all user-related activities.           | User Registration, Login & Authentication, Profile Management (Address, Phone).  |
| **Menu Management** | Allows restaurants to control their offerings. | Add, Update, and Remove Menu Items; Set Prices and Descriptions.               |
| **Order Management** | Manages the entire lifecycle of a food order.  | Order Placement, Order Status Updates (Pending, Preparing, etc.), Order History. |
| **Delivery Management** | Coordinates the logistics of order delivery.   | Assigning Delivery Agents, Real-time Delivery Tracking, Estimated Time of Arrival. |
| **Payment Management** | Processes all financial transactions securely. | Multiple Payment Methods (Credit Card, Wallet), Secure Payment Gateway Integration. |

---

## 3. Tech Stack & Architecture

Dine Cognizant utilizes a modern technology stack and a REST API-based architecture to ensure separation of concerns and scalability.

- **Frontend:**
    - **Angular** 
    - HTML5, CSS3, TypeScript
    - Responsive, Mobile-First Design

- **Backend:**
    - **Java (Spring Boot)**
    - RESTful API Architecture

- **Database:**
    - **MySQL**
    - Relational database design with clear primary and foreign key relationships.

---

## 4. Database Design

The database schema is designed to be efficient and normalized. The core entities include:

- `Customer`: Stores user profile information.
- `MenuItem`: Contains details of all food items from different restaurants.
- `Order`: Tracks all order details, linking customers and restaurants.
- `Delivery`: Manages delivery agent assignments and tracking.
- `Payment`: Logs transaction details for each order.

---

## 5. Key Features

### For Customers:
- **User-Friendly Registration & Login:** Quick and secure account creation.
- **Restaurant Discovery:** Easily browse a list of available restaurants.
- **Detailed Menus:** View item descriptions, prices, and images.
- **Seamless Ordering:** Add items to a cart and check out in a few clicks.
- **Secure Payments:** Integrated with trusted payment gateways.
- **Real-Time Order Tracking:** Monitor your order from the kitchen to your doorstep.

### For Restaurants:
- **Menu Management Dashboard:** Easily add, update, and manage your menuItems items.
- **Order Management Panel:** View incoming orders in real-time, accept or reject them.
- **Status Updates:** Keep customers informed by updating the order status.

---

## 6. Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites

- **Node.js** and npm (for the frontend)
- **JDK 11+** and Maven (for the Java backend) OR **.NET SDK** (for the .NET backend)
- A running instance of **MySQL** or your chosen database.

### Installation

1.  **Clone the repository:**
    ```sh
    git clone [https://github.com/sankalp-rm-rf/dine-cognizant](https://github.com/sankalp-rm-rf/dine-cognizant)
    ```

2.  **Setup the Backend:**
    - Navigate to the `backend` directory.
    - Update the `application.properties` or `appsettings.json` file with your database credentials.
    - Run the application:
      ```sh
      # For Java/Spring Boot
      mvn spring-boot:run
      ```

3.  **Setup the Frontend:**
    - Navigate to the `frontend` directory.
    - Install NPM packages:
      ```sh
      npm install
      ```
    - Start the development server:
      ```sh
      npm start
      ```
4. Open your browser and navigate to `http://localhost:4200` (for Angular) or `http://localhost:3000` (for React).

---

## 7. Non-Functional Requirements

The system is designed with the following quality attributes in mind:

- **Performance:** Engineered to handle over 100+ orders per minute with minimal latency.
- **Scalability:** The architecture allows for easy scaling to handle a growing number of users and restaurants.
- **Security:** Follows best practices for data protection, including encryption for sensitive payment information and compliance with PCI-DSS standards.
- **Usability:** A clean, intuitive, and mobile-responsive user interface for all users.