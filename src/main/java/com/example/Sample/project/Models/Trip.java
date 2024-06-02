package com.example.Sample.project.Models;



import lombok.Data;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;


@Data
    @Entity
    @Table(name = "trips")
    public class Trip {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;


        private String destination;


        private String startDate;


        private String endDate;

        @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<Expense> expenses;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }







}



