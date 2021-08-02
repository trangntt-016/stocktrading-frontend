package com.canada.edu.stocktrading.controller;

import com.canada.edu.stocktrading.dto.WatchListDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/watchlist")
public interface WatchListController {
    @GetMapping
    ResponseEntity<?> getAllWatchLists(@RequestParam(required = true) String userId);

    @PutMapping
    ResponseEntity<?> update(@RequestBody WatchListDto watchListDto);

    @DeleteMapping("/{watchlistId}")
    ResponseEntity<?> delete(@PathVariable("watchlistId") int watchlistId);

    @PostMapping
    ResponseEntity<?> create(@RequestParam String userId, @RequestBody String watchlistName);

    @GetMapping("/{watchlistId}/dailies")
    ResponseEntity<?> getAllDailiesByWatchListId(@PathVariable Integer watchlistId);

    @DeleteMapping("/{watchlistId}/symbols/{symbolId}")
    ResponseEntity<?> deleteASymbolFromWatchlistId(@PathVariable("watchlistId") int watchlistId, @PathVariable("symbolId") int symbolId);

}