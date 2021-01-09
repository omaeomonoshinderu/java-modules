package _04_California_Weather;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * Task:
 * 1. Create a program that allows the user to search for the weather
 * conditions of a given city in California. Use the example program below
 * and the Utilities class inside this project to get the temperature data
 * from a day in December 2020.
 * Example: User: Encinitas
 *          Program: Encinitas is Overcast with a tempeature of 59.01 °F
 * 
 * 2. Create a way for the user to specify the weather condition and then
 * list the cities that have those conditions.
 * Example: User: Mostly Cloudy
 *          Program: Long Beach, Pomona, Oceanside, ...
 * 
 * 3. Create a way for the user to enter a minimum and maximum temperature
 * and then list the cities that have temperatures within that range
 * Example: User: minimum temperature °F = 65.0, max temperature °F = 70.0
 *          Program: Fortana, Glendale, Escondido, Del Mar, ...
 *          
 * EXTRA.
 * Feel free to add pictures for specific weather conditions or a thermometer
 * for the temperature. Also If you want your program to get the current day's
 * temperature, you can get a free API key at: https://openweathermap.org/api 
 */

public class CaliforniaWeather implements ActionListener {
    JFrame frame;
    JPanel panel;
    JTextField field;
    JButton button;
    JTextArea area;
    HashMap<String, WeatherData> weatherData; 
    
    public static void main(String[] args) {
        new CaliforniaWeather().start();
    }
    
    public CaliforniaWeather() {
        area = new JTextArea(10, 30);
        field = new JTextField(20);
        button = new JButton("Find");
        button.addActionListener(this);
        
        panel = new JPanel();
        panel.add(field);
        panel.add(button);
        panel.add(area);
        
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("California Weather Finder");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.add(panel);
        frame.pack();
    }
    
    void start() {
        weatherData = Utilities.getWeatherData();
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        // All city keys have the first letter capitalized of each word
        String cityName = Utilities.capitalizeWords( field.getText() );
        WeatherData datum = weatherData.get(cityName);
        
        if( datum == null ) {
            area.setText("Unable to find weather data for: " + cityName);
        } else {
            area.setText(cityName + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
        }
        frame.pack();
    }
}
