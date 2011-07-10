package ecologylab.semantics.generated.library.publication;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  MmdInlineTermTypeInCommonTermsInPublication.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/10/11.
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

	public void setTerm(String term)
	{
		this.term().setValue(term);
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

	public void setFrequency(int frequency)
	{
		this.frequency().setValue(frequency);
	}

}
