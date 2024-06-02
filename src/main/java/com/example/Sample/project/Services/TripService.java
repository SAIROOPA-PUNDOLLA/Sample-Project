package com.example.Sample.project.Services;

import com.example.Sample.project.Models.Trip;
import com.example.Sample.project.Repositories.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {
    @Autowired
    private TripRepository tripRepo;

    public static List<Trip> findAll() {
        return null;
    }

    public List<Trip> getAllTrips() {
        return null;
    }

    public Trip createTrip(Trip trip) {
        return null;
    }

    public void deleteTrip(Long id) {
    }

    public Trip updateTrip(Trip trip) {
        return null;
    }

    public Trip saveTrip(Trip trip) {
        return null;
    }
}