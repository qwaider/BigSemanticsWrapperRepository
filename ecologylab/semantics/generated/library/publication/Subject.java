package ecologylab.semantics.generated.library.publication;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  Subject.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Subject extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL location;

	/** 
	 */ 
	@simpl_scalar	@simpl_composite_as_scalar
	private MetadataString subject;

	public Subject()
	{ }

	public Subject(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataParsedURL	location()
	{
		MetadataParsedURL	result = this.location;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.location = result;
		}
		return result;
	}

	public ParsedURL getLocation()
	{
		return this.location == null ? null : location().getValue();
	}

	public MetadataParsedURL getLocationMetadata()
	{
		return location;
	}

	public void setLocation(ParsedURL location)
	{
		if (location != null)
			this.location().setValue(location);
	}

	public void setLocationMetadata(MetadataParsedURL location)
	{
		this.location = location;
	}

	public MetadataString	subject()
	{
		MetadataString	result = this.subject;
		if (result == null)
		{
			result = new MetadataString();
			this.subject = result;
		}
		return result;
	}

	public String getSubject()
	{
		return this.subject == null ? null : subject().getValue();
	}

	public MetadataString getSubjectMetadata()
	{
		return subject;
	}

	public void setSubject(String subject)
	{
		if (subject != null)
			this.subject().setValue(subject);
	}

	public void setSubjectMetadata(MetadataString subject)
	{
		this.subject = subject;
	}
}
