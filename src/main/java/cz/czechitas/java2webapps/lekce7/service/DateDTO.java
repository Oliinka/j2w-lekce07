package cz.czechitas.java2webapps.lekce7.service;

import java.time.LocalDate;

/**
 * @author Filip Jirsák třída pro přenos dat
 */
public record DateDTO(String label, LocalDate date) {
}
