package roomescape.controller;

import java.time.LocalDate;
import java.time.LocalTime;

record CreateReservationRequest(LocalDate date, String name, LocalTime time) {
}
