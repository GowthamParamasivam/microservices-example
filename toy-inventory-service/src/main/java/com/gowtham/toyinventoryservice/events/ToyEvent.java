package com.gowtham.toyinventoryservice.events;

import com.gowtham.toyinventoryservice.dto.ToyDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ToyEvent implements Serializable {

    private static final long serialVersionUID = -5652890209086522749L;

    private ToyDto toyDto;
}
