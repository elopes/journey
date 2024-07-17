package com.enlopes.journey.link;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.enlopes.journey.trip.Trip;

@Service
public class LinkService {

    private final LinkRepository repository;

    public LinkService(LinkRepository repository) {
        this.repository = repository;
    }

    public LinkResponse registerLink(LinkRequest request, Trip trip){
        Link newLink = new Link(request.title(), request.url(), trip);

        repository.save(newLink);

        return new LinkResponse(newLink.getId());
    }

    public List<LinkData> getAllLinksFromTrip(UUID tripId){
        return repository.findByTripId(tripId).stream().map(link -> new LinkData(link.getId(), link.getTitle(), link.getUrl())).toList();
    }
}
