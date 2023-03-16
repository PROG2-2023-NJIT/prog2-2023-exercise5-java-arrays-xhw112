package prog2.exercise5.flight.booking.system;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;
public class FlightBooking {
    private String flightCompany;
    private String flightID;
    //private String passengerFullName;
    //private String tripSource;
    //private String sourceAirport;
    //private String tripDestination;
    //private String destinationAirport;
    private LocalDate departureDate;
    private LocalDate returnDate;
    private int childPassengers;
    private int adultPassengers;
    private int totalPassengers;
    private double departingTicketPrice;
    private double returnTicketPrice;
    private double totalTicketPrice;
    //private String ticketNumber;
    private String[] passengerFullName;
    private String[] passengerGender;
    private int[] passengerAge;
    private String[] ticketNumber;
    private Scanner scanner;

    // Constructor that takes in the number of tickets to be reserved
    public FlightBooking(int index) {
        this.passengerFullName = new String[index];
        this.passengerGender = new String[index];
        this.passengerAge = new int[index];
        this.ticketNumber = new String[index];
    }

    /*public FlightBooking(String[] passengerFullName,LocalDate departureDate,LocalDate returnDate,int childPassengers,int adultPassengers){
        this.passengerFullName = passengerFullName;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.childPassengers = childPassengers;
        this.adultPassengers = adultPassengers;
    }*/
    //Add an attribute named BookingClass(Exe4.Tesk2)
    public enum BookingClass {
        FIRST, BUSINESS, ECONOMY;
    }
    private BookingClass bookingClass;
    public BookingClass getBookingClass() {
        return bookingClass;
    }
    public void setBookingClass(String bookingClass) {
        switch (bookingClass) {
            case "1":
                this.bookingClass = BookingClass.FIRST;
                break;
            case "2":
                this.bookingClass = BookingClass.BUSINESS;
                break;
            case "3":
                this.bookingClass = BookingClass.ECONOMY;
                break;
            default:
                System.out.println("Invalid booking class: " + bookingClass);
        }
    }  
    //Update the attribute of tripType(Exe4.Test3)
    public enum TripType{
        ONE_WAY,RETURN;
    }
    private TripType tripType;
    public TripType getTripType() {
        return tripType;
    }
    public void setTripType(String tripType){
        switch(tripType){
            case "1":
                this.tripType = TripType.ONE_WAY;
                break;
            case "2":
                this.tripType = TripType.RETURN;
                break;
            default:
                System.out.println("Invalid trip type: " + tripType);
        }
    }
    
    //Increase trip sources and destinations(Exe4.Test 4 and 5)
    public enum TripSource {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;
    }

    public enum TripDestination {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;;
    }

    public enum SourceAirport {
        Nanjing_Lukou_International_Airport, Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, Oulu_Airport, Helsinki_Airport, Paris_Charles_de_Gaulle_Airport;
    }

    public enum DestinationAirport {
        Nanjing_Lukou_International_Airport, Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, Oulu_Airport, Helsinki_Airport, Paris_Charles_de_Gaulle_Airport;
    }
    private TripSource tripSource;
    private TripDestination tripDestination;
    private SourceAirport sourceAirport;
    private DestinationAirport destinationAirport;
    public TripSource getTripSource(){
        return tripSource;
    }
    public void setTripSource(String tripSource){
        switch(tripSource){
            case "1":
                this.tripSource = TripSource.NANJING;
                break;
            case "2":
                this.tripSource = TripSource.BEIJING;
                break;
            case "3":
                this.tripSource = TripSource.SHANGHAI;
                break;
            case "4":
                this.tripSource = TripSource.OULU;
                break;
            case "5":
                this.tripSource = TripSource.HELSINKI;
                break;
            case "6":
                this.tripSource = TripSource.PARIS;
                break;
            default:
                System.out.println("Error");
        }
    }
    public TripDestination getTripDestination(){
        return tripDestination;
    }
    public void setTripDestination(String tripSource,String tripDestination){
        if(tripSource != tripDestination){
            switch(tripDestination){
                case "1":
                    this.tripDestination = TripDestination.NANJING;
                    break;
                case "2":
                    this.tripDestination = TripDestination.BEIJING;
                    break;
                case "3":
                    this.tripDestination = TripDestination.SHANGHAI;
                    break;
                case "4":
                    this.tripDestination = TripDestination.OULU;
                    break;
                case "5":
                    this.tripDestination = TripDestination.HELSINKI;
                    break;
                case "6":
                    this.tripDestination = TripDestination.PARIS;
                    break;
                default:
                    System.out.println("Error"); 
            }
        }else{
            System.out.println("The trip source and destination CANNOT be the same location.");
        }
    }
    public SourceAirport getSourceAirport(){
        return sourceAirport;
    }
    public void setSourceAirport(String sourceAirport){
        if (tripSource == TripSource.NANJING) {
            this.sourceAirport = SourceAirport.Nanjing_Lukou_International_Airport;
        }
        if (tripSource == TripSource.BEIJING) {
            this.sourceAirport = SourceAirport.Beijing_Capital_International_Airport;
        }
        if (tripSource == TripSource.SHANGHAI) {
            this.sourceAirport = SourceAirport.Shanghai_Pudong_International_Airport;
        }
        if (tripSource == TripSource.OULU) {
            this.sourceAirport = SourceAirport.Oulu_Airport;
        }
        if (tripSource == TripSource.HELSINKI) {
            this.sourceAirport = SourceAirport.Helsinki_Airport;
        }
        if (tripSource == TripSource.PARIS) {
            this.sourceAirport = SourceAirport.Paris_Charles_de_Gaulle_Airport;
        }
    }
    public DestinationAirport getDestinationAirport(){
        return destinationAirport;
    }
    public void setDestinationAirport(String SourceAirport,String destinationAirport){
        if (tripDestination == TripDestination.NANJING) {
            this.destinationAirport = DestinationAirport.Nanjing_Lukou_International_Airport;
        }
        if (tripDestination == TripDestination.BEIJING) {
            this.destinationAirport = DestinationAirport.Beijing_Capital_International_Airport;
        }
        if (tripDestination == TripDestination.SHANGHAI) {
            this.destinationAirport = DestinationAirport.Shanghai_Pudong_International_Airport;
        }
        if (tripDestination == TripDestination.OULU) {
            this.destinationAirport = DestinationAirport.Oulu_Airport;
        }
        if (tripDestination == TripDestination.HELSINKI) {
            this.destinationAirport = DestinationAirport.Helsinki_Airport;
        }
        if (tripDestination == TripDestination.PARIS) {
            this.destinationAirport = DestinationAirport.Paris_Charles_de_Gaulle_Airport;
        }
    }
    // Conditional trip dates(Exe4.Test6)
    public LocalDate getDepartureDate() {
        return departureDate;
    }
    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }
    public LocalDate getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(LocalDate returnDate){
        long days = ChronoUnit.DAYS.between(departureDate, returnDate);
        if(days >= 2){
            this.returnDate = returnDate;
        }else{
            System.out.println("Invalid return date.The return date is changed to"+ departureDate.plusDays(2)+".");
            this.returnDate = departureDate.plusDays(2);
        }
    }
    /*//Conditional ticket number generation(Exe4.Test7)
    Random random = new Random();
    public String getTicketNumber(){
        switch (tripType) {
            case ONE_WAY:
                ticketNumber = "11";
                break;
            case RETURN:
                ticketNumber = "22";
                break;
        }
        switch (bookingClass) {
            case FIRST:
                ticketNumber = ticketNumber + "F";
                break;
            case BUSINESS:
                ticketNumber = ticketNumber + "B";
                break;
            case ECONOMY:
                ticketNumber = ticketNumber + "E";
                break;
        }
        for (int i = 0; i < 4; i++) {
            int num = random.nextInt(10);
            ticketNumber = ticketNumber + num;
        }
        if (tripSource == TripSource.NANJING && tripDestination == TripDestination.BEIJING) {
            ticketNumber = ticketNumber + "DOM";
        }
        if (tripSource == TripSource.NANJING && tripDestination == TripDestination.SHANGHAI){
            ticketNumber = ticketNumber + "DOM";
        }
        if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
            ticketNumber = ticketNumber + "DOM";
        }
        if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.SHANGHAI){
            ticketNumber = ticketNumber + "DOM";
        }
        if (tripSource == TripSource.SHANGHAI && tripDestination == TripDestination.NANJING){
            ticketNumber = ticketNumber + "DOM";
        }
        if (tripSource == TripSource.SHANGHAI && tripDestination == TripDestination.BEIJING){
            ticketNumber = ticketNumber + "DOM";
        }
        if (tripSource == TripSource.OULU && tripDestination == TripDestination.HELSINKI){
            ticketNumber = ticketNumber + "DOM";
        }
        if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.OULU){
            ticketNumber = ticketNumber + "DOM";
        }else{
            ticketNumber = ticketNumber + "INT";
        }
        return ticketNumber;
    }*/
    //Conditional total ticket price(Exe4.Test8)
    public void setDepartingTicketPrice(int childPassengers,int adultPassengers){
        if(tripSource == TripSource.NANJING && tripDestination == TripDestination.BEIJING){
            this.departingTicketPrice = 300 + 300 * 0.1 + 300 * 0.05;
        }
        if (tripSource == TripSource.NANJING && tripDestination == TripDestination.SHANGHAI){
            this.departingTicketPrice = 300 + 300 * 0.1 + 300 * 0.05;
        }
        if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
            this.departingTicketPrice = 300 + 300 * 0.1 + 300 * 0.05;
        }
        if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.SHANGHAI){
            this.departingTicketPrice = 300 + 300 * 0.1 + 300 * 0.05;
        }
        if (tripSource == TripSource.SHANGHAI && tripDestination == TripDestination.NANJING){
            this.departingTicketPrice = 300 + 300 * 0.1 + 300 * 0.05;
        }
        if (tripSource == TripSource.SHANGHAI && tripDestination == TripDestination.BEIJING){
            this.departingTicketPrice = 300 + 300 * 0.1 + 300 * 0.05;
        }
        if (tripSource == TripSource.OULU && tripDestination == TripDestination.HELSINKI){
            this.departingTicketPrice = 300 + 300 * 0.1 + 300 * 0.05;
        }
        if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.OULU){
            this.departingTicketPrice = 300 + 300 * 0.1 + 300 * 0.05;
        }else{
            this.departingTicketPrice = 300 + 300 * 0.15 + 300 * 0.1;
        }
        if (bookingClass == BookingClass.FIRST) {
            this.departingTicketPrice = departingTicketPrice * childPassengers + departingTicketPrice * adultPassengers + 250;
        }
        if (bookingClass == BookingClass.BUSINESS) {
            this.departingTicketPrice = departingTicketPrice * childPassengers + departingTicketPrice * adultPassengers + 150;
        }
        if (bookingClass == BookingClass.ECONOMY) {
            this.departingTicketPrice = departingTicketPrice * childPassengers + departingTicketPrice * adultPassengers + 50;
        }
    }
    public void setReturnTicketPrice() {
        if (tripType == TripType.ONE_WAY) {
            this.returnTicketPrice = 0;
        } else {
            this.returnTicketPrice = this.departingTicketPrice;
        }
    }

    /*public void setTotalTicketPrice() {
        this.totalTicketPrice = this.departingTicketPrice + this.returnTicketPrice;
    }

    public double getTotalTicketPrice() {
        return this.totalTicketPrice;
    }*/
    public void setTotalTicketPrice() {

        this.totalTicketPrice = Math.abs(2* ((0*(300 + (0.15*300) + (0.1*300) + 250)) + (3*(300 + (0.15*300) + (0.1*300) + 250))));
    }
    public double getTotalTicketPrice() {

        return totalTicketPrice;
    }
     // Setter and Getter for passengerFullName(Exe5)
     public void setPassengerFullName(int index, String fullName) {
        this.passengerFullName[index] = fullName;
    }
    public String getPassengerFullName(int index) {
        return this.passengerFullName[index];
    }
     // Setter and Getter for passengerGender(Exe5)
     public void setPassengerGender(int index, String gender) {
        this.passengerGender[index] = gender;
    }
    public String getPassengerGender(int index) {
        return this.passengerGender[index];
    }
    
    // Setter and Getter for passengerAge(Exe5)
    public void setPassengerAge(int index, int age) {
        this.passengerAge[index] = age;
    }
    public int getPassengerAge(int index) {
        return this.passengerAge[index];
    }
    // Setter and Getter for ticketNumber
    Random random = new Random();
    public void setTicketNumber(int index) {
        switch (tripType) {
            case ONE_WAY:
                ticketNumber[index] = "11";
                break;
            case RETURN:
                ticketNumber[index] = "22";
                break;
        }
        switch (bookingClass) {
            case FIRST:
                ticketNumber[index] = ticketNumber[index] + "F";
                break;
            case BUSINESS:
                ticketNumber[index] = ticketNumber[index] + "B";
                break;
            case ECONOMY:
                ticketNumber[index] = ticketNumber[index] + "E";
                break;
        }
        for (int i = 0; i < 4; i++) {
            int num = random.nextInt(10);
            ticketNumber[index] = ticketNumber[index] + num;
        }
        if (tripSource == TripSource.NANJING && tripDestination == TripDestination.BEIJING) {
            ticketNumber[index] = ticketNumber[index] + "DOM";
        }
        if (tripSource == TripSource.NANJING && tripDestination == TripDestination.SHANGHAI){
            ticketNumber[index] = ticketNumber[index] + "DOM";
        }
        if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
            ticketNumber[index] = ticketNumber[index] + "DOM";
        }
        if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.SHANGHAI){
            ticketNumber[index] = ticketNumber[index] + "DOM";
        }
        if (tripSource == TripSource.SHANGHAI && tripDestination == TripDestination.NANJING){
            ticketNumber[index] = ticketNumber[index] + "DOM";
        }
        if (tripSource == TripSource.SHANGHAI && tripDestination == TripDestination.BEIJING){
            ticketNumber[index] = ticketNumber[index] + "DOM";
        }
        if (tripSource == TripSource.OULU && tripDestination == TripDestination.HELSINKI){
            ticketNumber[index] = ticketNumber[index] + "DOM";
        }
        if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.OULU){
            ticketNumber[index] = ticketNumber[index] + "DOM";
        }else{
            ticketNumber[index] = ticketNumber[index] + "INT";
        }
    }
    public String getTicketNumber(int index) {
        return this.ticketNumber[index];
    }
    public void reserveTickets(int numTickets) {

        for (int i = 0; i < numTickets; i++) {
            System.out.println("Enter details for passenger " + (i + 1));
            System.out.print("Full Name: ");
            setPassengerFullName(i, scanner.nextLine());

            System.out.print("Gender: ");
            setPassengerGender(i, scanner.nextLine());

            System.out.print("Age: ");
            setPassengerAge(i, scanner.nextInt());
            scanner.nextLine();

            setTicketNumber(i);
        }


    }
        
        /*// Get other details
        System.out.print("Trip Source: " + tripSource);
        
        System.out.print("Trip Destination: " + tripDestination);
        
        System.out.print("Trip Type: " + tripType);
        
        System.out.print("Booking Class: " + bookingClass);
        
        System.out.print("Departure Date: " + departureDate);
        
        System.out.print("Return Date: " + returnDate);
        
        System.out.print("Ticket Price: " + totalTicketPrice);

    }*/
    

    //getters and setters(Exe3)
    
    public String getFlightCompany(){
        return flightCompany;
    }
    public void setFlightCompany(String flightCompany){
        this.flightCompany = flightCompany;
    }
    public String getFlightID(){
        return flightID;
    }
    public void setFlightID(String flightID){
        this.flightID = flightID;
    }
    /*public String getPassengerFullName(){
        return passengerFullName;
    }
    public void setPassengerFullName(String passengerFullName){
        this.passengerFullName = passengerFullName;
    }
    /*public String getTripSource(){
        return tripSource;
    }
    public void setTripSource(String tripSource){
        this.tripSource = tripSource;
    }
    public String getSourceAirport(){
        return sourceAirpot;
    }
    public void setSourceAirport(String sourceAirport){
        this.sourceAirpot = sourceAirport;
    }
    public String getTripDestination() {
        return tripDestination;
    }
    public void setTripDestination(String tripDestination) {
        this.tripDestination = tripDestination;
    }
    public String getDestinationAirport() {
        return destinationAirport;
    }
    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }
    public LocalDate getDepartureDate(){
        return departureDate;
    }
    public void setDepartureDate(LocalDate departurDate){
        this.departureDate = departurDate;
    }
    public LocalDate getReturnDate(){
        return returnDate;
    }
    public void setReturnDate(LocalDate returnDate){
        this.returnDate = returnDate;
    }*/
    public int getChildPassengers() {
    return childPassengers;
    }
    public void setChildPassengers(int childPassengers){
        this.childPassengers = childPassengers;
    }
    public int getAdultPassengers() {
        return adultPassengers;
    }
    public void setAdultPassengers(int adultPassengers){
        this.adultPassengers = adultPassengers;
    }
    public int getTotalPassengers(){
        return totalPassengers;
    }
    public void setTotalPassengers(int childPassengers,int adultPassengers){
        this.totalPassengers = childPassengers +adultPassengers;
    }
    public double getDepartingTicketPrice() {
        return departingTicketPrice;
    }
    /*public void setDepartingTicketPrice(double departingTicketPrice) {
        this.departingTicketPrice = departingTicketPrice;
    }
    public double getReturnTicketPrice() {
        return returnTicketPrice;
    }
    /*public void setReturnTicketPrice(double returnTicketPrice) {
        this.returnTicketPrice = returnTicketPrice;
    }
    public double getTotalTicketPrice() {
        return totalTicketPrice;
    }
    public void setTotalTicketPrice(double totalTicketPrice) {
        this.totalTicketPrice = totalTicketPrice;
    }
    public String getTicketNumber() {
        return ticketNumber;
    }
    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }*/
    /*public String toString(){
        return "Dear " + passengerFullName + ". Thank you for booking your flight with " + 
        flightCompany + "." + "\n" +
        "Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " + ticketNumber + "\n" + 
        "From " + tripSource + " to " + tripDestination + "\n" +
        "Date of departure: " + departureDate + "\n" +
        "Date of return: " + returnDate + "\n" +
        "Total passengers: " + totalPassengers + "\n" +
        "Total ticket price in Euros: " + totalTicketPrice; 
        }*/
        //Confirmation message
        /*private ConfirmationMessage confirmationMessage;

        enum ConfirmationMessage {
            CHANGE, SAVE
        }
    
        public void setConfirmationMessage(String confirmationmessage) {
            switch (confirmationmessage) {
                case "1":
                    this.confirmationMessage = confirmationMessage.CHANGE;
                    System.out.println("Thank you for booking your flight with " + flightCompany + ". Following are the details \n" +
                            "of your booking and the trip: \n" +
                            "Ticket Number: " + ticketNumber + "\n" +
                            "Passenger Name: " + passengerFullName + "\n" +
                            "From TripSource to " + tripDestination + "\n" +
                            "Date of departure: " + departureDate + "\n" +
                            "Date of return: ReturnDate (Changed from old ReturnDate to new\n" +
                            returnDate + ")\n" +
                            "Total passengers: " + totalPassengers + "\n" +
                            "Total ticket price in Euros: " + totalTicketPrice + "\n" +
                            "IMPORTANT NOTICE: As per our policy, the return date was changed because it was \n" +
                            "less than two days apart from your departure date");
                    break;
                case "2":
                    this.confirmationMessage = confirmationMessage.SAVE;
                    System.out.println("Thank you for booking your flight with " + flightCompany + ".Following are the details \n" +
                            "of your booking and the trip: \n" +
                            "Ticket Number: " + ticketNumber + "\n" +
                            "Passenger Name: " + passengerFullName + "\n" +
                            "From TripSource to " + tripDestination + "\n" +
                            "Date of departure: " + departureDate + "\n" +
                            "Date of return: " + returnDate + "\n" +
                            "Total passengers: " + totalPassengers + "\n" +
                            "Total ticket price in Euros: " + totalTicketPrice + "\n");
                    break;
            }
    
    
        }*/
        public void displayTripDetails() {
            System.out.println("Thank you for booking your flights with FLIGHT_COMPANY.");
            int numTickets = this.passengerFullName.length;
            System.out.println("You reserved a total of " + numTickets + " tickets.");
            
            // Loop through each passenger to display their details
            for (int i = 0; i < numTickets; i++) {
                System.out.println("Here are the trip details for Passenger No." + (i+1));
                System.out.println("Passenger's Ticket Number: " + getTicketNumber(i));
                System.out.println("Passenger's Full Name: " + getPassengerFullName(i));
                System.out.println("Passenger's Age: " + getPassengerAge(i));
                System.out.println("Passenger's Gender: " + getPassengerGender(i));
                System.out.println("From: " + tripSource + " (sourceAirport)");
                System.out.println("To: " + tripDestination + " (destinationAirport)");
                System.out.println("The flight departs on: " + departureDate);
                if (returnDate.equals("")) { // If return date was not changed
                    System.out.println("And the return flight is on: " + returnDate);
                } else { // If return date was changed
                    System.out.println("And the return flight is on: " + returnDate + " (Changed from old " + returnDate + " to new " + returnDate + ")");
                }
            }
        }           
}




