package com.example.javabdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EspClass {

    private double temperature;
    private double humidite;

    public EspClass () {
        this.temperature = temperature;
        this.humidite = humidite;
    };

    public double getTemperature() {

// Paramètres de connexion Read-Only
            String url = "jdbc:mariadb://10.194.36.90/pi-one";
            String user = "pi-one";
            String password = "raspberry";
            try {
// Établir la connexion
                Connection conn = DriverManager.getConnection(url, user, password);
// Créer une requête
                Statement requete = conn.createStatement();
                String sql = "SELECT temperature FROM capteursSalle01";
// Exécuter la requête
                ResultSet resultats = requete.executeQuery(sql);
// Traiter les résultats
                while (resultats.next()) {
// Récupérer les données par nom de colonne
                    int id = resultats.getInt("id");
                    String name = resultats.getString("temperature");
// Afficher les valeurs
                    System.out.println("ID: " + id + ", temperature : " + name);
                }
// Fermer les connexions
                resultats.close();
                requete.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        return temperature;
    };

    public void setTemperature(double temperature) {
        this.temperature = temperature;

    };

    public double getHumidite() {
        return humidite;
    };

    public void setHumidite(double humidite) {
        this.humidite = humidite;
    };

}
