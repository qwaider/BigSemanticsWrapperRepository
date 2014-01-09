package ecologylab.bigsemantics.generated.library.hotel;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.hotel.Hotel;
import ecologylab.bigsemantics.generated.library.product_and_service.Service;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Hotel extends Service
{
	@simpl_scalar
	private MetadataString spaceSize;

	@simpl_scalar
	private MetadataString bedrooms;

	@simpl_scalar
	private MetadataString sleeps;

	@simpl_scalar
	private MetadataString checkIn;

	@simpl_scalar
	private MetadataString checkOut;

	@simpl_collection("hotel")
	@mm_name("similar_hotels")
	private List<Hotel> similarHotels;

	public Hotel()
	{ super(); }

	public Hotel(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	spaceSize()
	{
		MetadataString	result = this.spaceSize;
		if (result == null)
		{
			result = new MetadataString();
			this.spaceSize = result;
		}
		return result;
	}

	public String getSpaceSize()
	{
		return this.spaceSize == null ? null : spaceSize().getValue();
	}

	public MetadataString getSpaceSizeMetadata()
	{
		return spaceSize;
	}

	public void setSpaceSize(String spaceSize)
	{
		if (spaceSize != null)
			this.spaceSize().setValue(spaceSize);
	}

	public void setSpaceSizeMetadata(MetadataString spaceSize)
	{
		this.spaceSize = spaceSize;
	}

	public MetadataString	bedrooms()
	{
		MetadataString	result = this.bedrooms;
		if (result == null)
		{
			result = new MetadataString();
			this.bedrooms = result;
		}
		return result;
	}

	public String getBedrooms()
	{
		return this.bedrooms == null ? null : bedrooms().getValue();
	}

	public MetadataString getBedroomsMetadata()
	{
		return bedrooms;
	}

	public void setBedrooms(String bedrooms)
	{
		if (bedrooms != null)
			this.bedrooms().setValue(bedrooms);
	}

	public void setBedroomsMetadata(MetadataString bedrooms)
	{
		this.bedrooms = bedrooms;
	}

	public MetadataString	sleeps()
	{
		MetadataString	result = this.sleeps;
		if (result == null)
		{
			result = new MetadataString();
			this.sleeps = result;
		}
		return result;
	}

	public String getSleeps()
	{
		return this.sleeps == null ? null : sleeps().getValue();
	}

	public MetadataString getSleepsMetadata()
	{
		return sleeps;
	}

	public void setSleeps(String sleeps)
	{
		if (sleeps != null)
			this.sleeps().setValue(sleeps);
	}

	public void setSleepsMetadata(MetadataString sleeps)
	{
		this.sleeps = sleeps;
	}

	public MetadataString	checkIn()
	{
		MetadataString	result = this.checkIn;
		if (result == null)
		{
			result = new MetadataString();
			this.checkIn = result;
		}
		return result;
	}

	public String getCheckIn()
	{
		return this.checkIn == null ? null : checkIn().getValue();
	}

	public MetadataString getCheckInMetadata()
	{
		return checkIn;
	}

	public void setCheckIn(String checkIn)
	{
		if (checkIn != null)
			this.checkIn().setValue(checkIn);
	}

	public void setCheckInMetadata(MetadataString checkIn)
	{
		this.checkIn = checkIn;
	}

	public MetadataString	checkOut()
	{
		MetadataString	result = this.checkOut;
		if (result == null)
		{
			result = new MetadataString();
			this.checkOut = result;
		}
		return result;
	}

	public String getCheckOut()
	{
		return this.checkOut == null ? null : checkOut().getValue();
	}

	public MetadataString getCheckOutMetadata()
	{
		return checkOut;
	}

	public void setCheckOut(String checkOut)
	{
		if (checkOut != null)
			this.checkOut().setValue(checkOut);
	}

	public void setCheckOutMetadata(MetadataString checkOut)
	{
		this.checkOut = checkOut;
	}

	public List<Hotel> getSimilarHotels()
	{
		return similarHotels;
	}

  // lazy evaluation:
  public List<Hotel> similarHotels()
  {
    if (similarHotels == null)
      similarHotels = new ArrayList<Hotel>();
    return similarHotels;
  }

  // addTo:
  public void addToSimilarHotels(Hotel element)
  {
    similarHotels().add(element);
  }

  // size:
  public int similarHotelsSize()
  {
    return similarHotels == null ? 0 : similarHotels.size();
  }

	public void setSimilarHotels(List<Hotel> similarHotels)
	{
		this.similarHotels = similarHotels;
	}
}
