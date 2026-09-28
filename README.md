# Application de Gestion de Comptes Bancaires (Activité Pratique N°1)

Ce dépôt contient la réalisation de l'Activité Pratique N°1 sur l'implémentation d'un micro-service de gestion de comptes bancaires avec Spring Boot, développé dans le cadre du cursus en Génie Logiciel et Systèmes Informatiques Distribués (GLSID) à l'ENSET Mohammedia[cite: 1].

---

## Objectif du Projet

L'objectif de ce projet est de concevoir et de développer un micro-service complet permettant la gestion des comptes bancaires en mettant en œuvre plusieurs couches architecturales, des API REST, des projections, des DTOs, ainsi qu'une interface GraphQL.

---

## Travail Réalisé et Étapes du TP

* **1. Initialisation du Projet :** Création d'un projet Spring Boot avec les dépendances Web, Spring Data JPA, H2 Database et Lombok.
* **2. Entité JPA Compte :** Conception de l'entité persistante représentant un compte bancaire avec ses attributs métier.
* **3. Couche DAO (Repository) :** Création de l'interface `CompteRepository` basée sur Spring Data pour la gestion de la persistance.
* **4. Test de la Couche DAO :** Validation des opérations CRUD via la base de données embarquée H2.
* **5. Web Service RESTful :** Développement des contrôleurs REST pour la gestion des comptes.
* **6. Tests Postman :** Validation des différents endpoints HTTP à l'aide d'un client REST.
* **7. Documentation Swagger :** Génération et test de la documentation interactive OpenAPI/Swagger des API REST.
* **8. Spring Data REST et Projections :** Exposition des API REST via Spring Data REST en exploitant des projections personnalisées.
* **9. DTOs et Mappers :** Implémentation des objets de transfert de données et des mappers pour le découplage des couches.
* **10. Couche Service (Métier) :** Développement de la logique métier et des services du micro-service.
* **11. API GraphQL :** Création d'un web service GraphQL alternatif pour l'interrogation flexible des données.

---

## Stack Technologique

* **Java 17** : Langage de programmation backend.
* **Spring Boot** : Framework principal pour le développement des micro-services.
* **Spring Data JPA & H2 Database** : Gestion de la persistance relationnelle.
* **Spring Data REST** : Exposition automatisée des repositories sous forme d'Hypermedia REST.
* **Spring for GraphQL** : Implémentation d'une API de requête GraphQL.
* **Springdoc OpenAPI (Swagger)** : Documentation automatique des points d'accès.
* **Lombok** : Réduction du code boilerplate.
* **Maven** : Gestion du cycle de vie et des dépendances.

---
  
* Établissement : ENSET Mohammedia[cite: 1]
