package ecologylab.semantics.generated.library.publication;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  MmdInlineTermTypeInCommonTermsInPublication.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/20/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineTermTypeInCommonTermsInPublication extends Document
{
	/** 
	 */ 
	@simpl_scalar @simpl_composite_as_scalar	private MetadataString term;

	/** 
	 */ 
	@simpl_scalar	private MetadataInteger frequency;

	public MmdInlineTermTypeInCommonTermsInPublication()
	{ }

	public MmdInlineTermTypeInCommonTermsInPublication(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	term()
	{
		MetadataString	result = this.term;
		if (result == null)
		{
			result = new MetadataString();
			this.term = result;
		}
		return result;
	}

	public String getTerm()
	{
		return this.term().getValue();
	}

	public MetadataString getTermMetadata()
	{
		return term;
	}

	public void setTerm(String term)
	{
		this.term().setValue(term);
	}

	public void setTermMetadata(MetadataString term)
	{
		this.term = term;
	}

	public MetadataInteger	frequency()
	{
		MetadataInteger	result = this.frequency;
		if (result == null)
		{
			result = new MetadataInteger();
			this.frequency = result;
		}
		return result;
	}

	public int getFrequency()
	{
		return this.frequency().getValue();
	}

	public MetadataInteger getFrequencyMetadata()
	{
		return frequency;
	}

	public void setFrequency(int frequency)
	{
		this.frequency().setValue(frequency);
	}

	public void setFrequencyMetadata(MetadataInteger frequency)
	{
		this.frequency = frequency;
	}
}
