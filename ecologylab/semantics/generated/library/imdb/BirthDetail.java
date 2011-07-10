package ecologylab.semantics.generated.library.imdb;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  BirthDetail.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/10/11.
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
	@simpl_scalar	private MetadataString dayOfBirth;

	/** 
	 */ 
	@simpl_scalar	private MetadataString yearOfBirth;

	/** 
	 */ 
	@simpl_scalar	private MetadataString placeOfBirth;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL dayOfBirthLink;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL yearOfBirthLink;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL placeOfBirthLink;

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
		return this.dayOfBirth().getValue();
	}

	public void setDayOfBirth(String dayOfBirth)
	{
		this.dayOfBirth().setValue(dayOfBirth);
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
		return this.yearOfBirth().getValue();
	}

	public void setYearOfBirth(String yearOfBirth)
	{
		this.yearOfBirth().setValue(yearOfBirth);
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
		return this.placeOfBirth().getValue();
	}

	public void setPlaceOfBirth(String placeOfBirth)
	{
		this.placeOfBirth().setValue(placeOfBirth);
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
		return this.dayOfBirthLink().getValue();
	}

	public void setDayOfBirthLink(ParsedURL dayOfBirthLink)
	{
		this.dayOfBirthLink().setValue(dayOfBirthLink);
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
		return this.yearOfBirthLink().getValue();
	}

	public void setYearOfBirthLink(ParsedURL yearOfBirthLink)
	{
		this.yearOfBirthLink().setValue(yearOfBirthLink);
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
		return this.placeOfBirthLink().getValue();
	}

	public void setPlaceOfBirthLink(ParsedURL placeOfBirthLink)
	{
		this.placeOfBirthLink().setValue(placeOfBirthLink);
	}

}
