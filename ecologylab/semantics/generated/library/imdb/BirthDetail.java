package ecologylab.semantics.generated.library.imdb;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  BirthDetail.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Metadata for storing details of birth (date and place) of people
 */ 
@simpl_inherit
public class BirthDetail extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataString dayOfBirth;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString yearOfBirth;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString placeOfBirth;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL dayOfBirthLink;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL yearOfBirthLink;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL placeOfBirthLink;

	public BirthDetail()
	{ }

	public BirthDetail(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	dayOfBirth()
	{
		MetadataString	result = this.dayOfBirth;
		if (result == null)
		{
			result = new MetadataString();
			this.dayOfBirth = result;
		}
		return result;
	}

	public String getDayOfBirth()
	{
		return this.dayOfBirth == null ? null : dayOfBirth().getValue();
	}

	public MetadataString getDayOfBirthMetadata()
	{
		return dayOfBirth;
	}

	public void setDayOfBirth(String dayOfBirth)
	{
		if (dayOfBirth != null)
			this.dayOfBirth().setValue(dayOfBirth);
	}

	public void setDayOfBirthMetadata(MetadataString dayOfBirth)
	{
		this.dayOfBirth = dayOfBirth;
	}

	public MetadataString	yearOfBirth()
	{
		MetadataString	result = this.yearOfBirth;
		if (result == null)
		{
			result = new MetadataString();
			this.yearOfBirth = result;
		}
		return result;
	}

	public String getYearOfBirth()
	{
		return this.yearOfBirth == null ? null : yearOfBirth().getValue();
	}

	public MetadataString getYearOfBirthMetadata()
	{
		return yearOfBirth;
	}

	public void setYearOfBirth(String yearOfBirth)
	{
		if (yearOfBirth != null)
			this.yearOfBirth().setValue(yearOfBirth);
	}

	public void setYearOfBirthMetadata(MetadataString yearOfBirth)
	{
		this.yearOfBirth = yearOfBirth;
	}

	public MetadataString	placeOfBirth()
	{
		MetadataString	result = this.placeOfBirth;
		if (result == null)
		{
			result = new MetadataString();
			this.placeOfBirth = result;
		}
		return result;
	}

	public String getPlaceOfBirth()
	{
		return this.placeOfBirth == null ? null : placeOfBirth().getValue();
	}

	public MetadataString getPlaceOfBirthMetadata()
	{
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth)
	{
		if (placeOfBirth != null)
			this.placeOfBirth().setValue(placeOfBirth);
	}

	public void setPlaceOfBirthMetadata(MetadataString placeOfBirth)
	{
		this.placeOfBirth = placeOfBirth;
	}

	public MetadataParsedURL	dayOfBirthLink()
	{
		MetadataParsedURL	result = this.dayOfBirthLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.dayOfBirthLink = result;
		}
		return result;
	}

	public ParsedURL getDayOfBirthLink()
	{
		return this.dayOfBirthLink == null ? null : dayOfBirthLink().getValue();
	}

	public MetadataParsedURL getDayOfBirthLinkMetadata()
	{
		return dayOfBirthLink;
	}

	public void setDayOfBirthLink(ParsedURL dayOfBirthLink)
	{
		if (dayOfBirthLink != null)
			this.dayOfBirthLink().setValue(dayOfBirthLink);
	}

	public void setDayOfBirthLinkMetadata(MetadataParsedURL dayOfBirthLink)
	{
		this.dayOfBirthLink = dayOfBirthLink;
	}

	public MetadataParsedURL	yearOfBirthLink()
	{
		MetadataParsedURL	result = this.yearOfBirthLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.yearOfBirthLink = result;
		}
		return result;
	}

	public ParsedURL getYearOfBirthLink()
	{
		return this.yearOfBirthLink == null ? null : yearOfBirthLink().getValue();
	}

	public MetadataParsedURL getYearOfBirthLinkMetadata()
	{
		return yearOfBirthLink;
	}

	public void setYearOfBirthLink(ParsedURL yearOfBirthLink)
	{
		if (yearOfBirthLink != null)
			this.yearOfBirthLink().setValue(yearOfBirthLink);
	}

	public void setYearOfBirthLinkMetadata(MetadataParsedURL yearOfBirthLink)
	{
		this.yearOfBirthLink = yearOfBirthLink;
	}

	public MetadataParsedURL	placeOfBirthLink()
	{
		MetadataParsedURL	result = this.placeOfBirthLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.placeOfBirthLink = result;
		}
		return result;
	}

	public ParsedURL getPlaceOfBirthLink()
	{
		return this.placeOfBirthLink == null ? null : placeOfBirthLink().getValue();
	}

	public MetadataParsedURL getPlaceOfBirthLinkMetadata()
	{
		return placeOfBirthLink;
	}

	public void setPlaceOfBirthLink(ParsedURL placeOfBirthLink)
	{
		if (placeOfBirthLink != null)
			this.placeOfBirthLink().setValue(placeOfBirthLink);
	}

	public void setPlaceOfBirthLinkMetadata(MetadataParsedURL placeOfBirthLink)
	{
		this.placeOfBirthLink = placeOfBirthLink;
	}
}
