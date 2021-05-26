package com.ftninfowrmatika.jwd48.testback.support;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninfowrmatika.jwd48.testback.model.Odsustvo;
import com.ftninfowrmatika.jwd48.testback.web.dto.OdsustvoDTO;

@Component
public class OdsustvoToOdsustvoDto implements Converter<Odsustvo, OdsustvoDTO> {

	@Override
	public OdsustvoDTO convert(Odsustvo source) {
		OdsustvoDTO dto = new OdsustvoDTO();
		dto.setDatumPocetka(source.getDatumPocetka());
		dto.setId(source.getId());
		dto.setRandnihDana(source.getRadnihDana());
		dto.setRadnikId(source.getRadnik().getId());
		
		return dto;
	}

}
