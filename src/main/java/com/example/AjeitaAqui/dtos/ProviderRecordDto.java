package com.example.AjeitaAqui.dtos;

import java.util.List;
import jakarta.validation.constraints.NotNull;

public record ProviderRecordDto(@NotNull String name, @NotNull String surname, @NotNull String telephone,
                                @NotNull String email, @NotNull String password, @NotNull String description,
                                @NotNull List<String> servicesToProvide) {
}
