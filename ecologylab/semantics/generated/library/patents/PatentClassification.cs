//
// PatentClassification.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.patents 
{
	[SimplInherit]
	public class PatentClassification : Document
	{
		[SimplScalar]
		private MetadataString patentClass;

		public PatentClassification()
		{ }

		public PatentClassification(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString PatentClass
		{
			get{return patentClass;}
			set
			{
				if (this.patentClass != value)
				{
					this.patentClass = value;
					this.RaisePropertyChanged( () => this.PatentClass );
				}
			}
		}
	}
}
