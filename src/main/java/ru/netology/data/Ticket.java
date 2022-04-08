package ru.netology.data;

public class Ticket implements Comparable<Ticket> {


    public int id;
    public int cost;
    public String fromAirport;
    public String toAirport;
    public int travelTime;

    public Ticket(int id, int cost, String fromAirport, String toAirport, int travelTime) {
        this.id = id;
        this.cost = cost;
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
        this.travelTime = travelTime;
    }

    public Ticket() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public String getToAirport() {
        return toAirport;
    }

    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    @Override
    public int compareTo(Ticket o) {
        return this.cost - o.cost;

    }
//    id
//    Стоимость (для упрощения будем считать стоимость единой для всех продавцов)
//    Аэропорт вылета (вы можете использовать IATA-коды)
//    Аэропорт прилёта (вы можете использовать IATA-коды)
//    Время в пути (в минутах)
}
