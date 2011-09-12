package ecologylab.semantics.generated.library.gps;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.semantics.metadata.scalar.MetadataDouble;

/**
*  GisLocation.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class GisLocation extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataDouble latitude;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataDouble longitude;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataDouble altitude;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString satellites;

	public GisLocation()
	{ }

	public GisLocation(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataDouble	latitude()
	{
		MetadataDouble	result = this.latitude;
		if (result == null)
		{
			result = new MetadataDouble();
			this.latitude = result;
		}
		return result;
	}

	public Double getLatitude()
	{
		return this.latitude == null ? 0.0 : latitude().getValue();
	}

	public MetadataDouble getLatitudeMetadata()
	{
		return latitude;
	}

	public void setLatitude(Double latitude)
	{
		if (latitude != 0.0)
			this.latitude().setValue(latitude);
	}

	public void setLatitudeMetadata(MetadataDouble latitude)
	{
		this.latitude = latitude;
	}

	public MetadataDouble	longitude()
	{
		MetadataDouble	result = this.longitude;
		if (result == null)
		{
			result = new MetadataDouble();
			this.longitude = result;
		}
		return result;
	}

	public Double getLongitude()
	{
		return this.longitude == null ? 0.0 : longitude().getValue();
	}

	public MetadataDouble getLongitudeMetadata()
	{
		return longitude;
	}

	public void setLongitude(Double longitude)
	{
		if (longitude != 0.0)
			this.longitude().setValue(longitude);
	}

	public void setLongitudeMetadata(MetadataDouble longitude)
	{
		this.longitude = longitude;
	}

	public MetadataDouble	altitude()
	{
		MetadataDouble	result = this.altitude;
		if (result == null)
		{
			result = new MetadataDouble();
			this.altitude = result;
		}
		return result;
	}

	public Double getAltitude()
	{
		return this.altitude == null ? 0.0 : altitude().getValue();
	}

	public MetadataDouble getAltitudeMetadata()
	{
		return altitude;
	}

	public void setAltitude(Double altitude)
	{
		if (altitude != 0.0)
			this.altitude().setValue(altitude);
	}

	public void setAltitudeMetadata(MetadataDouble altitude)
	{
		this.altitude = altitude;
	}

	public MetadataString	satellites()
	{
		MetadataString	result = this.satellites;
		if (result == null)
		{
			result = new MetadataString();
			this.satellites = result;
		}
		return result;
	}

	public String getSatellites()
	{
		return this.satellites == null ? null : satellites().getValue();
	}

	public MetadataString getSatellitesMetadata()
	{
		return satellites;
	}

	public void setSatellites(String satellites)
	{
		if (satellites != null)
			this.satellites().setValue(satellites);
	}

	public void setSatellitesMetadata(MetadataString satellites)
	{
		this.satellites = satellites;
	}
}
